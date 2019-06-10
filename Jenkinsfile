pipeline {
    agent { dockerfile true }
    parameters {
        string (name: 'Environment', defaultValue: 'int', choices:['int/nstage/nproduction'] ,description: 'The target environment')   
    }
    stages {
        stage('Building project') {
            steps {
                sh 'mvn clean install'
            }
        }          
        stage('checking directories') {
            steps {
                sh 'pwd'
                sh 'ls target/'
                sh 'ls target/site/jacoco/'
                sh 'ls target/surefire-reports/'
            }
        }   
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
            sh 'export PATH=/opt/glassfish-4.1.1/bin:$PATH'
            sh 'asadmin deploy --force target/calc-jsf-1.0.war'
        }
    }
}
