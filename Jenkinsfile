pipeline {
    agent { dockerfile true }
        
    stages {
        stage('Test') {
            steps {
                sh 'asadmin start-domain domain1'
            }
        }
        stage('Test2') {
            steps {
                 sh 'echo "from image"'
                sh 'pwd'
            }
        }       
    }
}
