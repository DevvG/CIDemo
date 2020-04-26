pipeline {
   agent any
   environment {
       registry = "localhost:5000"
       
   }
   stages{
       stage('Build'){
        steps{
           sh 'mvn clean install'
           sh 'mvn package'
        }
       }
    stage('Docker Build and Push'){
        steps{
            sh 'mvn docker:build docker:push'
        }
    }
    
    stage('Deploy the image to Kubernetes Cluster'){
        steps{             

             sh '/usr/local/bin/helm install demoapp /var/lib/jenkins/demoapp --set image.repository=192.168.1.6:5000/sampleapp,image.tag=0.0.1-SNAPSHOT'
             sleep time: 1, unit: 'MINUTES'
             sh 'ls -ltr'
             sh 'mvn verify -Pcategory'
        }
    }

       
   }
   post{
       always{
           sh '/usr/local/bin/helm delete demoapp'
           cleanWs()
       }
   }
   }
