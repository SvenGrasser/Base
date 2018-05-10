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
		withMaven()  {
		    sh 'mvn test -f logging/pom.xml'
		}
        }
        stage('Deploy') {
		withMaven()  {
		    sh 'mvn install -f logging/pom.xml'
		}
        }
    }
}
