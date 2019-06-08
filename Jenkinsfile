pipeline {
    agent { dockerfile true }
        
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
            jacoco( 
                  execPattern: 'target/*.exec',
                  classPattern: 'target/classes',
                  sourcePattern: 'src/main/java',
                  exclusionPattern: 'src/test*'
            )
        }
        success {
            archive "target/calc-jsf-1.0.war"
        }
    }
}
