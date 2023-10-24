function Lista({mesas}){

    return(

        <>
        <h3>Lista de Mesas</h3>
        {
        mesas.length > 0 ?(
            mesas.map((mesas,index) =>(<p key = {index}>{mesas}</p>))

        ):(
            <p>Não ha mesas</p>
        )}
        </>

    )

}

export default Lista