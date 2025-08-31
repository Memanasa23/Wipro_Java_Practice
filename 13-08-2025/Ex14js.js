let cities = ["Delhi", "Mumbai", "Kolkata", "Bangalore", "Chennai", "Ahmedabad"];

function populateDropdown() {
    let dropdown = document.getElementById("cityDropdown");
    dropdown.length = 1;
    console.log(cities);

    cities.sort();

    console.log("Sorted cities:", cities);

    cities.forEach(city => {
        let option = new Option(city, city); 
        dropdown.add(option);
    });
}
