async function data() {
    let data = await fetch(api);
    let json = await data.json();
}