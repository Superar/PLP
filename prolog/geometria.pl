vertical(seg(ponto(X,Y), ponto(X,Y1))).
horizontal(seg(ponto(X,Y),ponto(X1,Y))).

% vertical(seg(ponto(1,1), ponto(1,2))).
%   true
% vertical(seg(ponto(1,1), ponto(2,Y))).
%   false
% horizontal(seg(ponto(1,1), ponto(2,Y))).
%   Y = 1
% vertical(seg(ponto(2,3),P)).
%   P = ponto(2,Y1)
