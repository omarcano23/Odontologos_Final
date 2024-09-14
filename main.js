document.addEventListener("DOMContentLoaded", function () {
  const apiUrl = "http://localhost:8080/odontologos";
  const odontologosList = document.getElementById("odontologos-list");
  const addOdontologoForm = document.getElementById("add-odontologo-form");

  function fetchOdontologos() {
    fetch(apiUrl)
      .then((response) => response.json())
      .then((data) => {
        odontologosList.innerHTML = "";
        data.forEach((odontologo) => {
          const li = document.createElement("li");
          li.textContent = `${odontologo.matricula} - ${odontologo.nombre} ${odontologo.apellido}`;
          odontologosList.appendChild(li);
        });
      });
  }

  addOdontologoForm.addEventListener("submit", function (e) {
    e.preventDefault();
    const matricula = document.getElementById("matricula").value;
    const nombre = document.getElementById("nombre").value;
    const apellido = document.getElementById("apellido").value;

    fetch(apiUrl, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ matricula, nombre, apellido }),
    })
      .then((response) => response.json())
      .then(() => {
        fetchOdontologos();
        addOdontologoForm.reset();
      });
  });

  fetchOdontologos();
});
