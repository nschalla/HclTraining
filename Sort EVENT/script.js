var eventDetails=[];
function addEvent(){

    var event=document.getElementById("eventName").value;
    if(eventDetails.includes(event)){
        document.getElementById("successMessage").innerHTML="EVENT ALREADY EXISTS";
    }
    else{
        eventDetails.push(event);
        document.getElementById("successMessage").innerHTML="EVENT IS SUCCESSFULLY INSERTED";

    }
function displayEvents(){
    console.log("table");
    var result=document.getElementById("results");
    var h3=document.createElement("h3");
    h3.innerHTML="EVENT DETAILS";
    h3.appendChild(result);
    var table=document.createElement("table");
    table.style.border="1px solid";
    table.appendChild(result);
    var tableheader=document.createElement("th");
    th.appendChild(table);
    sortEVENT[]=eventDetails.sort();
    for(var i=0;i<eventDetails.length;i++){
        var td =document.createElement("td");
        td.appendChild(table);
        td.innerHTML=sortEVENT[i];
    }
}

}