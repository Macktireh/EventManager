/*
DATE: 2024-12-08 13:34:30
DESCRIPTION: Create the roles table and insert default roles
*/

CREATE TABLE IF NOT EXISTS roles 
(
    id BIGSERIAL PRIMARY KEY,
    public_id UUID NOT NULL UNIQUE DEFAULT gen_random_uuid(),
    name VARCHAR(50) NOT NULL,
    description TEXT,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO roles (public_id, name, description)
VALUES 
    (gen_random_uuid(), 'ADMIN', 'Administrator with full access'),
    (gen_random_uuid(), 'USER', 'Regular user with limited access'),
    (gen_random_uuid(), 'MODERATOR', 'Moderator with content management privileges');
