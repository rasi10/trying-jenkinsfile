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
                sh 'ls'
            }
        }   
    }
}
