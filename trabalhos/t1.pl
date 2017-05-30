desparentize([], []) :- !.
desparentize([Cabeca | Cauda], [Cabeca | Cauda2]) :- atomic(Cabeca),
                                                     desparentize(Cauda, Cauda2), !.
desparentize([Cabeca | Cauda], ListaOut) :- var(Cabeca),
                                            desparentize(Cauda, ListaOut), !.
desparentize([Cabeca | Cauda], ListaOut) :- desparentize(Cabeca, Aux1),
                                            desparentize(Cauda, Aux2),
                                            append(Aux1, Aux2, ListaOut).
