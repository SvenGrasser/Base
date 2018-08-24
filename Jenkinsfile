#!groovy
pipeline {
    agent any    
    stages {
        stage('Build') {
            steps {                 
                withMaven()  {
                    sh 'mvn compile -f logging/pom.xml'
                    sh 'mvn compile -f arch-unit-base/pom.xml'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven()  {
                    sh 'mvn test -f logging/pom.xml'
                    sh 'mvn test -f arch-unit-base/pom.xml'
                }
            }
        }
        stage('Deploy') {
            steps {
                withMaven()  {
                    sh 'mvn install -f logging/pom.xml'
                    sh 'mvn install -f arch-unit-base/pom.xml'
                }
            }
        }
    }
}
