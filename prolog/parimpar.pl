len([], 0).
len([_ | Cauda], Tam) :- len(Cauda, Aux), Tam is Aux + 1.

n_par(Lista) :- len(Lista, Tam), Bool is mod(Tam, 2), Bool = 0.
n_impar(Lista) :- len(Lista, Tam), Bool is mod(Tam, 2), Bool = 1.
