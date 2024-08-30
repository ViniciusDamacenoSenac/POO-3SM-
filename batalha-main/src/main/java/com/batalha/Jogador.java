package com.batalha;

import java.util.Random;

public class Jogador {

    private String classe;
    private int vida;
    private int experiencia;
    private boolean temAntidoto;

    public Jogador(String classe) {
        this.classe = classe;
        this.vida = 100;
        this.experiencia = 0;
        this.temAntidoto = false;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public boolean isTemAntidoto() {
        return temAntidoto;
    }

    public void guardarAntidoto() {
        this.temAntidoto = true;
    }

    public void atacar(Jogador oponente) {
        int dano = this.experiencia;
        oponente.vida -= dano;
        this.experiencia++;
        System.out.println(this.classe + " atacou " + oponente.getClasse() + " e causou " + dano + " de dano!");
    }

    public void curar(Jogador oponente) {
        oponente.vida += 5;
        System.out.println(this.classe + " curou " + oponente.getClasse() + " em 5 pontos de vida!");

        // 10% de chance de drop de um antídoto
        if (new Random().nextInt(100) < 10) {
            this.guardarAntidoto();
            System.out.println(this.classe + " encontrou um antídoto!");
        }
    }

    public void darAntidoto(Jogador oponente) {
        if (this.temAntidoto) {
            oponente.guardarAntidoto();
            this.temAntidoto = false;
            System.out.println(this.classe + " deu um antídoto para " + oponente.getClasse());
        } else {
            System.out.println(this.classe + " não tem um antídoto para dar.");
        }
    }

    public int getVida() {
        return vida;
    }

    public int getExperiencia() {
        return experiencia;
    }
}
