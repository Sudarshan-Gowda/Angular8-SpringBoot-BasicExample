export class CustomMessage {

    projectName: String;
    serverSideLanguage: String;
    frontEndLanguage: String;
    description: String;

    constructor(projectName:String, serverSideLanguage:String, frontEndLanguage: String, description:String){
        this.projectName=projectName;
        this.serverSideLanguage = serverSideLanguage;
        this.frontEndLanguage = frontEndLanguage;
        this.description = description;
    }
}
