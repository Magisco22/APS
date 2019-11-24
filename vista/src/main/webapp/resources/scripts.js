function openNav() {
    document.getElementById("mySidenav").style.visibility = "visible";
    document.getElementById("mySidenav").style.width = "10%";

    document.getElementById("pagRP").style.paddingLeft = "23%";
    document.getElementById("pagCP").style.paddingLeft = "23%";
    document.getElementById("pagMP").style.paddingLeft = "23%";
    document.getElementById("pagEP").style.paddingLeft = "23%";

    document.getElementById("pagRPD").style.paddingLeft = "23%";
    document.getElementById("pagCPD").style.paddingLeft = "23%";
    document.getElementById("pagMPD").style.paddingLeft = "23%";
    document.getElementById("pagEPD").style.paddingLeft = "23%";

    document.getElementById("pagRI").style.paddingLeft = "28%";
    document.getElementById("pagCI").style.paddingLeft = "23%";
    document.getElementById("pagMI").style.paddingLeft = "23%";
    document.getElementById("pagEI").style.paddingLeft = "23%";


}

/* Set the width of the side navigation to 0 and the left margin of the page content to 0 */
function closeNav() {
    document.getElementById("mySidenav").style.visibility = "hidden";
    document.getElementById("pagRP").style.paddingLeft = "20%";
//    document.getElementById("mySidenav").style.width = "20px";
//    document.getElementById("main").style.marginLeft = "20%";

//  document.getElementById("main").style.top = "85px";
}
/*  ------------------ MANTENIMIENTO DE PACIENTES ------------------  */

function mostrarPagRP() {
    document.getElementById("pagRP").style.visibility = "visible";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";
}
function mostrarPagCP() {
    
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "visible";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";
}
function mostrarPagMP() {
    
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "visible";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";
}
function mostrarPagEP() {
    
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "visible";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";
}
/*  ----------------- MANTENIMIENTO DE INSTRUMENTAL ----------------  */
function mostrarPagRI() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "visible";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";
}
function mostrarPagCI() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "visible";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";

}
function mostrarPagMI() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "visible";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";
}
function mostrarPagEI() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "visible";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";
}
/*  ---------------- MANTENIMIENTO DE PRO. DENTALES ----------------  */
function mostrarPagRPD() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "visible";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";

}
function mostrarPagCPD() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "visible";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";
}
function mostrarPagMPD() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "visible";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";
}
function mostrarPagEPD() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "visible";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";
}
/*  ------------------- MANTENIMIENTO DE CITAS ---------------------  */
function mostrarPagRC() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "visible";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";

}
function mostrarPagCC() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "visible";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "hidden";

}
function mostrarPagMC() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "visible";
    document.getElementById("pagEC").style.visibility = "hidden";

}
function mostrarPagEC() {
    document.getElementById("pagRP").style.visibility = "hidden";
    document.getElementById("pagCP").style.visibility = "hidden";
    document.getElementById("pagMP").style.visibility = "hidden";
    document.getElementById("pagEP").style.visibility = "hidden";

    document.getElementById("pagRI").style.visibility = "hidden";
    document.getElementById("pagCI").style.visibility = "hidden";
    document.getElementById("pagMI").style.visibility = "hidden";
    document.getElementById("pagEI").style.visibility = "hidden";

    document.getElementById("pagRPD").style.visibility = "hidden";
    document.getElementById("pagCPD").style.visibility = "hidden";
    document.getElementById("pagMPD").style.visibility = "hidden";
    document.getElementById("pagEPD").style.visibility = "hidden";

    document.getElementById("pagRC").style.visibility = "hidden";
    document.getElementById("pagCC").style.visibility = "hidden";
    document.getElementById("pagMC").style.visibility = "hidden";
    document.getElementById("pagEC").style.visibility = "visible";
}