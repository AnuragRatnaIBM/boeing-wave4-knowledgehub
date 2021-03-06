package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TermNode {
    // These are intent TermNode present in Neo4j Intent graph
    @Id
    private int id;
    private String name;
    private String parent_id;
    private String parent_node_type;
    private String type;
    private String relationship;
    private String weight;
}
