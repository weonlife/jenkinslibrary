def call(String stageName){
if ("${stageName}" == "Build")
{
sh "mvn clean package"
}
}
