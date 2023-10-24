import Button from "./Button"

function Event(){

    function MyEvent(){
        console.log('OIOIOIOIOIO')
    }

    

    return(
        <>
        <p>clique para evento:</p>
        <Button  event={(MyEvent)} text="Evento"/>
        <button onClick={MyEvent}>CLIQUE!</button>

        </>
    )
}
export default Event