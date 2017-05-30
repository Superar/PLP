add_ultimo(X, [], [X]).
add_ultimo(X, [Cabeca | Cauda1], [Cabeca | Cauda2]) :- add_ultimo(X, Cauda1, Cauda2).

shift_esq([Cabeca | Cauda], Lista) :- add_ultimo(Cabeca, Cauda, Lista).
shift_dir(Lista1, Lista2) :- shift_esq(Lista2, Lista1).

shift_n_esq(0, Lista1, Lista1) :- !.
shift_n_esq(N, Lista1, Lista2) :- shift_esq(Lista1, Aux),
                                  Next is N - 1,
                                  shift_n_esq(Next, Aux, Lista2).

traduz([], []).
traduz(1, um).
traduz(2, dois).
traduz(3, tres).
traduz(4, quatro).
traduz(5, cinco).
traduz(6, seis).
traduz(7, sete).
traduz(8, oito).
traduz(9, nove).
traduz([Cabeca | Cauda], [LetraCabeca | LetraCauda]) :- traduz(Cabeca, LetraCabeca),
                                                        traduz(Cauda, LetraCauda).

subset(_, []) :- !.
subset([Cabeca1 | Cauda1], [Cabeca2 | Cauda2]) :- Cabeca1 == Cabeca2,
                                                  subset(Cauda1, Cauda2), !.
subset([_| Cauda1], Lista2) :- subset(Cauda1, Lista2).

max(X, Y, X) :- X >= Y, !.
max(X, Y, Y) :- Y > X.

maxlista([],0) :- !.
maxlista([X], X) :- !.
maxlista([Primeiro, Segundo | Cauda], Max) :- max(Primeiro, Segundo, Aux),
                                              maxlista(Cauda, Aux2),
                                              max(Aux, Aux2, Max).

between(N1, N1, [N1]) :- !.
between(N1, N2, [Cabeca | Cauda]) :- N1 < N2, Cabeca is N1,
                                     Next is N1 + 1,
                                     between(Next, N2, Cauda).

classe(0, zero) :- !.
classe(N, positivo) :- N > 0, !.
classe(_, negativo).

split([], [], []) :- !.
split([Cabeca | Cauda], Positivos, [Cabeca | Cauda2]) :- Cabeca < 0,
                                                         split(Cauda, Positivos, Cauda2), !.
split([Cabeca | Cauda], [Cabeca | Cauda2], Negativos) :- split(Cauda, Cauda2, Negativos).

in(X, [Cabeca | _]) :- X == Cabeca, !.
in(X, [_ | Cauda]) :- in(X, Cauda).

uniao([], Lista2, Lista2) :- !.
uniao([Cabeca | Cauda], Lista2, [Cabeca | Aux]) :- not(in(Cabeca, Lista2)),
                                                   uniao(Cauda, Lista2, Aux), !.
uniao([_ | Cauda], Lista2, Retorno) :- uniao(Cauda, Lista2, Retorno).

interseccao([], _, []) :- !.
interseccao([Cabeca | Cauda], Lista2, [Cabeca | RetornoCauda]) :- in(Cabeca, Lista2),
                                                                  interseccao(Cauda, Lista2, RetornoCauda), !.
interseccao([_ | Cauda], Lista2, Retorno) :- interseccao(Cauda, Lista2, Retorno).

diferenca([], _, []) :- !.
diferenca([Cabeca | Cauda], Lista2, [Cabeca | RetornoCauda]) :- not(in(Cabeca, Lista2)),
                                                                diferenca(Cauda, Lista2, RetornoCauda), !.
diferenca([_ | Cauda], Lista2, Retorno) :- diferenca(Cauda, Lista2, Retorno).

interseccao_tres(Lista1, Lista2, Lista3, Retorno) :- interseccao(Lista1, Lista2, Aux),
                                                     interseccao(Lista3, Aux, Retorno).
