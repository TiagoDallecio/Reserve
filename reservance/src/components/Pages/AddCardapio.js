import styles from '../Pages/Cardapio.module.css';
import CaixaCardapio from '../Layout/CaixaCardapio';
import imagem from '../../img/pratorestaurante.png';
import imagem1 from '../../img/restaurantecima.png';


const Pratos = [
    {
        id: 1,
        name: "Macarrão",
        descricao: "blablabla",
        preco: "20,00",
        url: imagem
        
    },
    {
        id: 2,
        name: "Risotto",
        descricao: "blablabla",
        preco: "30.00",
        url: imagem1
    },
];

function AddCardapio() {
    return (
        <div className={styles.container}>

            <div className={styles.nome}>
                <h1 className={styles.h1}>Restaurante</h1>
                
            </div>

                {Pratos.map(prato => (
                    <div className={styles.layout}>
                        <CaixaCardapio key={prato.id} nome={prato.name} descricao={prato.descricao} preco={prato.preco} url={prato.url} />
                    </div>
                ))}
            <div>
                <button>+ Adicionar Produto</button>
            </div>
        </div>
    );
}

export default AddCardapio;