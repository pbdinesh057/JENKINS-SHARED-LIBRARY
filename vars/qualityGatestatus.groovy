def call(credentialId){
waitForQualityGate abortPipeline: false, credentialsId: credentialId
}



//while doing quality gate status check sonarqube needs to authenticate with jenkins for passing on information to jenkins reg quality status checks.