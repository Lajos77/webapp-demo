pipeline {
    agent any
    
    stages {
        // " " <-- ez a groovy string
        // ' ' <-- ez a Java string
        stage("Compile") {
           
           steps {
               echo "Compiling..."
           }
        }
        
        stage("Unit test") {
          steps {
              echo "Teseting"
          }
        }
        
                
        stage("Package") {
          steps {
              echo "Packing..."
          }
        }
        
                
        stage("Deploy") {
          steps {
              echo "Deploying..."
          }
        }
    }
}