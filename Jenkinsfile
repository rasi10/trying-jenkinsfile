pipeline {
    agent { dockerfile true }
        
    stages {
        stage('Echo PATH') {
            steps {
                sh 'echo $PATH'
            }
        }      
        
        stage('Test maven') {
            steps {
                sh 'mvn -v'
            }
        }  
    }
}
