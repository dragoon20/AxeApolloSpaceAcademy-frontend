/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function flightOption(checked){
    if(checked == "true"){
        document.getElementById('tanggal-kembali').style.visibility = "visible";
    }else{
        document.getElementById('tanggal-kembali').style.visibility = "hidden";
    }
}