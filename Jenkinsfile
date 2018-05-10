#!groovy
pipeline {
    agent any    
    stages {
        stage('Build') {
            steps {
		withMaven()  {
		    sh 'mvn install -f logging/pom.xml'
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
