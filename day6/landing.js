const con =document.getElementById("container")
const arr =[".assets/coffee2.jpg",
"./assets/coffee3.webp",
"./assets/coffee4.jpg",
"./assets/coffee5.jpg",
"./assets/coffee6.jpg"
]

let i=0;
let next=()=>{
    i++;
    if(i==arr.length)
    {
        i=0;
    }
    

    con.style.backgroundImage=`url('${arr[i]}')`;
}
let prev=()=>{
    i--;//i=-1
    if(i==-1)
    {
        i=4;
    }
    con.style.backgroundImage=`url('${arr[i]}')`;
    
}

let change=(a)=>{
    con.style.backgroundImage=`url('${arr[a]}')`;
}


setInterval(()=>{
  next();
},2000)
