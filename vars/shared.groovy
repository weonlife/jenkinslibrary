def call(String stagename){
if ("${stageName}" == "Build")
{
sh "mvn clean package"
}
}
