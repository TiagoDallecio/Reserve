import styles from'./ProjectForm.module.css';
import React, { useState } from 'react';
import axios from 'axios';
import Input from '../form/Input'
import Select from '../form/Select'
import SubmitButton from '../form/SubmitButton'
import CriarProjeto from '../Pages/CriarProjeto';



    const AdicionarEstab = () => {

        const moment = require('moment')
    
        const[nome, setNome] = useState('');
        const[funcionamento_dia, setFuncionamento_dia] = useState('');
        const[hora_inicio, setHora_inicio] = useState('');
        const[hora_fim, setHora_fim] = useState('');
        const[num_mesas, setNum_mesas] = useState('');
    
        const hora_inicioStr = moment({hora_inicio}).format('HH:mm')
        const hora_fimStr = moment({hora_fim}).format('HH:mm')
    
        const handleAdicionarEstab = async () => {
            try{
                console.log('Iniciando a solicitação...');
            const EstabResponse = await axios.post('http://localhost:8080/api/estabelecimento', {
                nome,
                funcionamento_dia,
                hora_inicio: hora_inicioStr,
                hora_fim: hora_fimStr,
                num_mesas: parseInt(num_mesas)
            });
    
            console.log('Resposta do Backend: ', EstabResponse.data);
            setNome('');
            setFuncionamento_dia('');
            setHora_inicio('');
            setHora_fim('');
            setNum_mesas('');
        } catch (error){
            console.error('Erro ao enviar os dados:', error);
        }
    };

    return(
        <form className={styles.form}>
        <Input type="text" text="Nome do Restaurante" name="Nome" placeholder="Insira o Nome do Restaurante" value = {nome} onChange={(e) => setNome(e.target.value)} />
        <Input type="number" text="Número de mesas" name="NumeroMesas" placeholder="Número de Mesas" value = {num_mesas} onChange={(e) => setNum_mesas(e.target.value)} />
        <Input type="text" text="Dias de funcionamento" name="Diasdefuncionamento" placeholder="Funcionamento" value = {funcionamento_dia} onChange={(e) => setFuncionamento_dia(e.target.value)} />
        <Input type="time" text="Horário de Abertura" name="Abertura" placeholder="Abertura" value = {hora_inicio} onChange={(e) => setHora_inicio(e.target.value)}/>
        <Input type="time" text="Horário de Fechamento" name="Fechamento" placeholder="Fechamento" value = {hora_fim} onChange={(e) => setHora_fim(e.target.value)} />
        

        <button onClick={handleAdicionarEstab}>Criar</button>

        </form>
        )
    }
export default AdicionarEstab;