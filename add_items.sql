use database_store;
insert into items (name, price, category, imported, quantity) values 
('libro', '12.49', 'libro', false, 100),  
('CD de música', '14.99', 'otro', false, 100), 
('barrita de chocolate', '0.85', 'alimentacion', false, 100), 
('caja de bombones', '10.00', 'alimentacion', true, 100), 
('frasco de perfume', '47.50', 'otro', true, 100), 
('frasco de perfume', '27.99', 'otro', true, 100), 
('frasco de perfume', '18.99', 'otro', false, 100), 
('caja de pastillas para el dolor de cabeza', '9.75', 'productos medicos', false, 100), 
('caja de bombones', '11.25', 'alimentacion', true, 100);
SELECT * FROM database_store.items;