import React, { useState } from 'react';
import styles from '../Pages/Addprato.module.css';

function Addprato() {
    const [pratos, setPratos] = useState([
        {
            id: 1,
            nome: "Macarrão",
            descricao: "Delicioso macarrão com molho de tomate.",
            preco: 20.00,
        },
        {
            id: 2,
            nome: "Risotto",
            descricao: "Risotto cremoso com cogumelos.",
            preco: 30.00,
        }
    ]);

    const [novoPrato, setNovoPrato] = useState({ nome: '', descricao: '', preco: '', imagem: null });
    const [pratoEditando, setPratoEditando] = useState(null);

    const handleNovoPratoChange = (e) => {
        const { name, value } = e.target;
        setNovoPrato(prevState => ({ ...prevState, [name]: value }));
    };

    const handleImagemChange = (e) => {
        const file = e.target.files[0];
        setNovoPrato(prevState => ({ ...prevState, imagem: file }));
    };

    const handleNovoPratoSubmit = (e) => {
        e.preventDefault();
        const novoId = pratos.length + 1;
        const novoPratoComId = { ...novoPrato, id: novoId };
        setPratos([...pratos, novoPratoComId]);
        setNovoPrato({ nome: '', descricao: '', preco: '', imagem: null });
    };

    const handleEditarPrato = (prato) => {
        setPratoEditando(prato);
    };

    const handleSalvarEdicao = () => {
        const novosPratos = pratos.map(item => {
            if (item.id === pratoEditando.id) {
                return pratoEditando;
            }
            return item;
        });
        setPratos(novosPratos);
        setPratoEditando(null);
    };

    const handleCancelarEdicao = () => {
        setPratoEditando(null);
    };

    const handleRemoverPrato = (id) => {
        const pratosFiltrados = pratos.filter(prato => prato.id !== id);
        setPratos(pratosFiltrados);
    };

    return (
        <div className={styles.container}>
            <h2>Adicionar Novo Prato</h2>
            <form onSubmit={handleNovoPratoSubmit}>
                
                <div className={styles.inputGroup}>
                    <label htmlFor="nome">Nome:</label>
                    <input
                        type="text"
                        id="nome"
                        name="nome"
                        value={novoPrato.nome}
                        onChange={handleNovoPratoChange}
                        required
                    />
                </div>

                <div className={styles.inputGroup}>
                    <label htmlFor="imagem">Imagem:</label>
                    <input
                        type="file"
                        id="imagem"
                        name="imagem"
                        onChange={handleImagemChange}
                        accept="image/*"
                    />
                </div>

                <div className={styles.inputGroup}>
                    <label htmlFor="descricao">Descrição:</label>
                    <textarea
                        id="descricao"
                        name="descricao"
                        value={novoPrato.descricao}
                        onChange={handleNovoPratoChange}
                        required
                    />
                </div>
                <div className={styles.inputGroup}>
                    <label htmlFor="preco">Preço:</label>
                    <input
                        type="number"
                        id="preco"
                        name="preco"
                        value={novoPrato.preco}
                        onChange={handleNovoPratoChange}
                        required
                    />
                </div>
                <button className={styles.button} type="submit">Adicionar Prato</button>
            </form>

            <h2>Pratos Existentes</h2>
            <ul>
                {pratos.map(prato => (
                    <li key={prato.id}>
                        {/* Renderização condicional para editar pratos */}
                        {pratoEditando && pratoEditando.id === prato.id ? (
                            <>
                                <div>
                                    <input
                                        type="text"
                                        name="nome"
                                        value={pratoEditando.nome}
                                        onChange={(e) => setPratoEditando({ ...pratoEditando, nome: e.target.value })}
                                        required
                                    />
                                </div>
                                <div>
                                    <textarea
                                        name="descricao"
                                        value={pratoEditando.descricao}
                                        onChange={(e) => setPratoEditando({ ...pratoEditando, descricao: e.target.value })}
                                        required
                                    />
                                </div>
                                <div>
                                    <input
                                        type="number"
                                        name="preco"
                                        value={pratoEditando.preco}
                                        onChange={(e) => setPratoEditando({ ...pratoEditando, preco: e.target.value })}
                                        required
                                    />
                                </div>
                                <div>
                                    <button className={styles.button} onClick={handleSalvarEdicao}>Salvar</button>
                                    <button className={styles.button} onClick={handleCancelarEdicao}>Cancelar</button>
                                </div>
                            </>
                        ) : (
                            <>
                                <div>
                                    <strong>Nome:</strong> {prato.nome}
                                </div>
                                <div>
                                    <strong>Descrição:</strong> {prato.descricao}
                                </div>
                                <div>
                                    <strong>Preço:</strong> R$ {prato.preco}
                                </div>
                                <div>
                                    <button className={styles.button} onClick={() => handleEditarPrato(prato)}>Editar</button>
                                    <button className={styles.button} onClick={() => handleRemoverPrato(prato.id)}>Remover</button>
                                </div>
                            </>
                        )}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default Addprato;
