#!groovy
pipeline {
    agent any    
    stages {
        stage('Build') {
            steps {
		withMaven()  {
		    sh 'mvn compile -f logging/pom.xml'
		}
	    }
	}
        stage('Test') {
            steps {
		sh 'mvn test -f logging/pom.xml'
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn deploy -f logging/pom.xml'
            }
        }
    }
}
