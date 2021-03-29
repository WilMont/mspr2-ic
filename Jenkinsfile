pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk11'
    }
    parameters {
        booleanParam(name: "Perform release ?", description: '', defaultValue: false)
    }
    stages {
        stage('Initialize') {
            steps {
                bat '''
                    echo "PATH = ${PATH}"
                '''
            }
        }
        stage('Build') {
            steps {
                bat 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
		stage('Sonarqube') {
			steps {
				bat 'mvn sonar:sonar \
					-Dsonar.projectKey=mspr2-ic \
					-Dsonar.host.url=http://localhost:9000 \
					-Dsonar.login=3ac657a4a4776af1c77174b413e893082ccf04d1'
            }	
        }
	}
}