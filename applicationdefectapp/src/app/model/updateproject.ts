export class updateProject
{
     projectId:number
     projectName:string;
     projectLead:string;
     teamCount:number;
    startDate;
    constructor(projectId:number,projectName:string,projectLead:string,teamCount:number,startDate)
    {
        this.projectId=projectId;
        this.teamCount=teamCount;
        this.projectLead=projectLead;
        this.projectName=projectName;
        this.startDate=startDate;
    }
    getProjectName():string
    {
        return this.projectName;
    }
    getProjectLead():string
    {
        return this.projectLead;
    }
    getTeamCount():number
    {
        return this.teamCount;
    }
    getStartDate()
    {
        return this.startDate;
    }
    getProjectId():number
    {
        return this.projectId;
    }
}