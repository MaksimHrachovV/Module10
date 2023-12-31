INSERT INTO CLIENT(NAME) VALUES ('Max'), ('Gregor'), ('Leon'), ('Taras'), ('Inna'), ('Oleg'), ('Anna'), ('Georg'), ('Sveta'), ('Ivan');

INSERT INTO PLANET (ID, NAME)
VALUES
    ('MERCURY1', 'mə:kjuri'),
    ('VENUS2', 'vi:nəs'),
    ('EARTH3', 'ə:θ'),
    ('MARS4', 'mɑ:z'),
    ('JUPITER5', 'dʒu:pɪtər');

INSERT INTO TICKET (CREATED_AT, CLIENT_ID, FROM_PLANET_ID, TO_PLANET_ID)
VALUES
    (CURRENT_TIMESTAMP(), 1, 'MERCURY1', 'VENUS2'),
    (CURRENT_TIMESTAMP(), 10, 'VENUS2', 'EARTH3'),
    (CURRENT_TIMESTAMP(), 2, 'EARTH3', 'MARS4'),
    (CURRENT_TIMESTAMP(), 3, 'MARS4', 'JUPITER5'),
    (CURRENT_TIMESTAMP(), 4, 'JUPITER5', 'MERCURY1'),
    (CURRENT_TIMESTAMP(), 5, 'VENUS2', 'EARTH3'),
    (CURRENT_TIMESTAMP(), 6, 'EARTH3', 'MARS4'),
    (CURRENT_TIMESTAMP(), 7, 'MARS4', 'JUPITER5'),
    (CURRENT_TIMESTAMP(), 8, 'JUPITER5', 'MERCURY1'),
    (CURRENT_TIMESTAMP(), 9, 'MERCURY1', 'VENUS2');