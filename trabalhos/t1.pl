desparentize([], []) :- !.
desparentize([Cabeca | Cauda], [Cabeca | CaudaOut]) :- atomic(Cabeca),
                                                       desparentize(Cauda, CaudaOut), !.
desparentize([Cabeca | Cauda], ListaOut) :- is_list(Cabeca),
                                            desparentize(Cabeca, Aux1),
                                            desparentize(Cauda, Aux2),
                                            append(Aux1, Aux2, ListaOut), !.
desparentize([_ | Cauda], ListaOut) :- desparentize(Cauda, ListaOut).


tira_nao_comuns([], _, []) :- !.
tira_nao_comuns([Cabeca | Cauda], Lista2, [Cabeca | CaudaOut]) :- member(Cabeca, Lista2),
                                                                  tira_nao_comuns(Cauda, Lista2, CaudaOut), !.
tira_nao_comuns([_ | Cauda], Lista2, ListaOut) :- tira_nao_comuns(Cauda, Lista2, ListaOut).


elimina_repetidos([], []) :- !.
elimina_repetidos([Cabeca | Cauda], ListaOut) :- member(Cabeca, Cauda),
                                                 elimina_repetidos(Cauda, ListaOut), !.
elimina_repetidos([Cabeca | Cauda], [Cabeca | CaudaOut]) :- elimina_repetidos(Cauda, CaudaOut).


quantas_vezes(_, [], 0) :- !.
quantas_vezes(X, [X | Cauda], N) :- quantas_vezes(X, Cauda, Aux), N is Aux + 1, !.
quantas_vezes(X, [_ | Cauda], N) :- quantas_vezes(X, Cauda, N).


elimina_ocorrencias(_, [], []) :- !.
elimina_ocorrencias(X, [X | Cauda], Lout) :- elimina_ocorrencias(X, Cauda, Lout), !.
elimina_ocorrencias(X, [Cabeca | Cauda], [Cabeca | CaudaOut]) :- elimina_ocorrencias(X, Cauda, CaudaOut).
