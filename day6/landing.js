const con =document.getElementById("container")
const arr =["./assets/coffee2.jpg",
"./assets/coffee3.webp",
"./assets/coffee44.jpg",
"./assets/coffee5.jpg",
"./assets/coffee6.jpg"
]

const img = document.getElementsByClassName('img');
console.log(img);

let i=0;
let next=()=>{
    img[i].classList.remove('active');
    i++;

    if(i==arr.length)
    {
        i=0;
    }
    img[i].classList.add('active');
    

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
