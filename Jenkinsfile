pipeline {
    agent none
    parameters {
        string (name: 'DEPLOY_ENV', defaultValue: 'int', description: 'The target environment')   
        
    }
    stages {       
        stage('Building project') {
            agent { 
                docker{ image 'rasilva1986/java-maven:alm'}
            }   
            steps {
                sh 'mvn clean install'
            }
            post {
                always {            
                    junit 'target/surefire-reports/*.xml'
                    publishHTML([
                    allowMissing          : false,
                    alwaysLinkToLastBuild : false,
                    keepAll               : true,
                    reportDir             : 'target/site/jacoco/',
                    reportFiles           : 'index.html',
                    reportTitles          : "Tests coverage",
                    reportName            : "Tests coverage"
                    ])
                }
                success {
                    archive "target/calc-jsf-1.0.war"
                }
            } 
        }         
       
        stage('Deploying'){
            agent any
            steps{
                sh 'export PATH=/opt/glassfish-4.1.1/bin/asadmin:$PATH'
                sh 'asadmin --port 4848 deploy --force --name calculator-${DEPLOY_ENV} --contextroot calculator-${DEPLOY_ENV} target/calc-jsf-1.0.war'
            }
        } 
    }
}
