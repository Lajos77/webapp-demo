pipeline {
    agent any
    
    stages {
        // " " <-- ez a groovy string
        // ' ' <-- ez a Java string
        stage("Compile") {
           
           steps {
              sh "mvn compile"
           }
        }
        
        stage("Unit test") {
          steps {
              sh "mvn surefire:test"
          }
        }
        
                
        stage("Package") {
          steps {
              sh "mvn war:war"
          }
          
          post {
              success {
                  archiveArtifacts artifacts: "target/*.war", fingerprint: true
              
          }
        }
        }
                
        stage("Deploy") {
          steps {
              echo "Deploying..."
          }
        }
    }
    post {
        always {
            sh "mvn clean"
        }
    }
    
    
}