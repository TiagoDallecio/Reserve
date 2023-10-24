function Event(){

    function MyEvent(){
        console.log('OIOIOIOIOIO')
    }

    return(
        <>
        <p>
            clique para evento:
        </p>

        <button onClick={MyEvent}>CLIQUE!</button>

        </>
    )
}
export default Event