fetch('https://jsonplaceholder.typicode.com/photos')
.then(res => res.json())
.then(pic => {
    console.log(pic);
    
    let body = document.getElementById('img-container');
    for(let i=0; i<pic.length; i++){
        // let photo = pic[i];
        let img = document.createElement('img');
        img.src = pic[i].url;
        img.style.height = "100px";
        img.style.width = "100px";
        body.appendChild(img);
    }

    // pic.map((i) => {
    //     let img = document.createElement('img');
    //     img.src = i.url;
    //     img.style.height = "100px";
    //     img.style.width = "100px";
    //     body.appendChild(img);    
    // })
})
.catch((err) => {
    console.log(err);
})
