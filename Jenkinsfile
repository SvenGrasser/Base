#!groovy
pipeline {
    agent any    
    stages {
        stage('Build') {
            steps {
		withMaven()  {
		    sh 'mvn test'
		}
	    }
	}
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
