pipeline {
    agent { dockerfile true }
        
    stages {
        stage('Test') {
            steps {
                sh 'echo "from image"'
                sh 'pwd'
            }
            
            steps {
                sh 'asadmin start-domain domain1'
            }
        }
    }
}
