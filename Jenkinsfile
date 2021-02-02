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
        stage('Deploy') {​​​​
            steps {​​​​
                bat 'mvn  -s C:/Users/bobra/.m2/settings.xml deploy'
            }​​​​
        }
        }