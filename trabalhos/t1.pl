desparentize([], []) :- !.
desparentize([Cabeca | Cauda], [Cabeca | CaudaOut]) :- atomic(Cabeca),
                                                     desparentize(Cauda, CaudaOut), !.
desparentize([Cabeca | Cauda], ListaOut) :- var(Cabeca),
                                            desparentize(Cauda, ListaOut), !.
desparentize([Cabeca | Cauda], ListaOut) :- desparentize(Cabeca, Aux1),
                                            desparentize(Cauda, Aux2),
                                            append(Aux1, Aux2, ListaOut).

tira_nao_comuns([], _, []) :- !.
tira_nao_comuns([Cabeca | Cauda], Lista2, [Cabeca | CaudaOut]) :- member(Cabeca, Lista2),
                                                                  tira_nao_comuns(Cauda, Lista2, CaudaOut), !.
tira_nao_comuns([_ | Cauda], Lista2, ListaOut) :- tira_nao_comuns(Cauda, Lista2, ListaOut).
