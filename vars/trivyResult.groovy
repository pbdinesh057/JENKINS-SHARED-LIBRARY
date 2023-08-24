def call(){
    sh """
      chmod +x /var/lib/jenkins/workspace/Java-Pipeline-App/trivy-results.sh
      cd /var/lib/jenkins/workspace/Java-Pipeline-App/ && bash trivy-results.sh
      """
}