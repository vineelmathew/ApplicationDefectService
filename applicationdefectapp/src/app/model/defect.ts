export class Defect
{
    id:number;
    summary:string;
     priority:string;
     defectDate;
     projectId:number;
    constructor(summary:string,priority:string,defectDate,projectId:number)
    {
        this.summary=summary;
        this.priority=priority;
        this.defectDate=defectDate;
        this.projectId=projectId;
    }
    getProjectId():number
    {
        return this.projectId;
    }
    getSummary():string
    {
        return this.summary;
    }
    getDefectDate(){
        return this.defectDate;
    }
    getPriority():string
    {
        return this.priority;
    }
    getId():number{
        return this.id;
    }
}