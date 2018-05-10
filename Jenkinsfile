#!groovy
pipeline {
    agent any    
    
    stages {
        stage('Build') {
            steps {
		deleteDir()
		withMaven()  {
		    sh 'mvn compile -f logging/pom.xml'
		}
	    }
	}
        stage('Test') {
            withMaven()  {
		    sh 'mvn compile -f logging/pom.xml'
		}
        }
        stage('Deploy') {
            withMaven()  {
		    sh 'mvn compile -f logging/pom.xml'
		}
        }
    }
}
