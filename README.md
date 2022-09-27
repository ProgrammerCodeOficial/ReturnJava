<h1 align="center"> 📚 Return no Java </h1>

<p align="center"> Estudando e entendendo os métodos de retorno em Java. </p>

<h2> 🤔 O que é return em Java? </h2>

<p>
O return serve para retornar algo dentro do método.

Todo método que não seja void está informando ao Java que ele vai retornar um valor e, por isso, 
</p></br>


<h2> 🤔 O método executa seu retorno quando ?</h2>

<p>

- Completa todas as instruções internas.

- Chega a uma declaração explicita de retorno.- Lança uma exceção.

- Se o método for sem retorno (void), pode ou não ter um "return" para encerrar sua execução. 

- O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto. 

- O tipo de dado do return deve ser compatível com o do método.</p></br>

><h3> Exemplos</h3>

### ✔️ Correto

```shell
    public String getMensagem(){
        return "Olá!";
    }
    

    public double getJuros(){
        return 2.36;
    }
```

### ❌ Erro de Compilação

```shell
    public int getParcelas(){
        return 1.36f;
    }
    

    public void setIdade(){
        return 10;
    }
```

### ✔️ Utilizando void com uma estrutura condicional

```shell
    public void executar(){
        ...
        return
        ...
    }
```
</br>

<h2> 🤝 Contribuindo </h2>

<p>
Este repositório foi criado para fins de estudo. Fique a vontade para contribuir!
    
Se te ajudei de alguma forma, ficarei feliz em saber. 😜
    
Caso você conheça alguém que se identifique com esse conteúdo, não deixe de compartilhar.
</br>


> <h4>Se possível:</h4>
- ⭐️ Dê Star para o projeto
- 🐛 Encontrar e relatar issues
</p>


------------
Disponibilizado 😜 por [Diego Moura dos Santos](https://www.linkedin.com/in/diegomouradossantos/).

