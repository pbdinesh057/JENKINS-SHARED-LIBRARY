def call(){
    sh 'mvn clean package'
    sh 'mvn clean test'
}