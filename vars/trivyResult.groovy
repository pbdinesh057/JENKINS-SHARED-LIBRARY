def call(){
    sh """
      chmod +x /var/lib/jenkins/workspace/java-devopd-project/trivy-results.sh
      cd /var/lib/jenkins/workspace/java-devopd-project/ && bash trivy-results.sh
      """
}