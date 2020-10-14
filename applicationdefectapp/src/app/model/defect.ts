export class Defect
{
    private summary:string;
    private  priority:string;
    private  defectDate;
    private  projectId:number;
    constructor(summary:string,priority:string,defectDate,projectId:number)
    {
        this.summary=summary;
        this.priority=priority;
        this.defectDate=defectDate;
        this.projectId=projectId;
    }
    getProjectId()
    {
        return this.projectId;
    }
    getSummary()
    {
        return this.summary;
    }
    getDefectDate(){
        return this.defectDate;
    }
    getPriority()
    {
        return this.priority;
    }
}