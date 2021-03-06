﻿#pragma warning disable 1591
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.296
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ServiceGenes
{
	using System.Data.Linq;
	using System.Data.Linq.Mapping;
	using System.Data;
	using System.Collections.Generic;
	using System.Reflection;
	using System.Linq;
	using System.Linq.Expressions;
	using System.ComponentModel;
	using System;
	
	
	[global::System.Data.Linq.Mapping.DatabaseAttribute(Name="DBReniec")]
	public partial class ReniecDataContext : System.Data.Linq.DataContext
	{
		
		private static System.Data.Linq.Mapping.MappingSource mappingSource = new AttributeMappingSource();
		
    #region Extensibility Method Definitions
    partial void OnCreated();
    partial void InsertPersona(Persona instance);
    partial void UpdatePersona(Persona instance);
    partial void DeletePersona(Persona instance);
    #endregion
		
		public ReniecDataContext() : 
				base(global::System.Configuration.ConfigurationManager.ConnectionStrings["DBReniecConnectionString"].ConnectionString, mappingSource)
		{
			OnCreated();
		}
		
		public ReniecDataContext(string connection) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public ReniecDataContext(System.Data.IDbConnection connection) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public ReniecDataContext(string connection, System.Data.Linq.Mapping.MappingSource mappingSource) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public ReniecDataContext(System.Data.IDbConnection connection, System.Data.Linq.Mapping.MappingSource mappingSource) : 
				base(connection, mappingSource)
		{
			OnCreated();
		}
		
		public System.Data.Linq.Table<Persona> Personas
		{
			get
			{
				return this.GetTable<Persona>();
			}
		}
	}
	
	[global::System.Data.Linq.Mapping.TableAttribute(Name="dbo.Persona")]
	public partial class Persona : INotifyPropertyChanging, INotifyPropertyChanged
	{
		
		private static PropertyChangingEventArgs emptyChangingEventArgs = new PropertyChangingEventArgs(String.Empty);
		
		private string _v_dni;
		
		private string _v_nombre;
		
		private string _v_direccion;
		
		private string _v_fec_nac;
		
    #region Extensibility Method Definitions
    partial void OnLoaded();
    partial void OnValidate(System.Data.Linq.ChangeAction action);
    partial void OnCreated();
    partial void Onv_dniChanging(string value);
    partial void Onv_dniChanged();
    partial void Onv_nombreChanging(string value);
    partial void Onv_nombreChanged();
    partial void Onv_direccionChanging(string value);
    partial void Onv_direccionChanged();
    partial void Onv_fec_nacChanging(string value);
    partial void Onv_fec_nacChanged();
    #endregion
		
		public Persona()
		{
			OnCreated();
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_v_dni", DbType="Char(8) NOT NULL", CanBeNull=false, IsPrimaryKey=true)]
		public string v_dni
		{
			get
			{
				return this._v_dni;
			}
			set
			{
				if ((this._v_dni != value))
				{
					this.Onv_dniChanging(value);
					this.SendPropertyChanging();
					this._v_dni = value;
					this.SendPropertyChanged("v_dni");
					this.Onv_dniChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_v_nombre", DbType="VarChar(60)")]
		public string v_nombre
		{
			get
			{
				return this._v_nombre;
			}
			set
			{
				if ((this._v_nombre != value))
				{
					this.Onv_nombreChanging(value);
					this.SendPropertyChanging();
					this._v_nombre = value;
					this.SendPropertyChanged("v_nombre");
					this.Onv_nombreChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_v_direccion", DbType="VarChar(100)")]
		public string v_direccion
		{
			get
			{
				return this._v_direccion;
			}
			set
			{
				if ((this._v_direccion != value))
				{
					this.Onv_direccionChanging(value);
					this.SendPropertyChanging();
					this._v_direccion = value;
					this.SendPropertyChanged("v_direccion");
					this.Onv_direccionChanged();
				}
			}
		}
		
		[global::System.Data.Linq.Mapping.ColumnAttribute(Storage="_v_fec_nac", DbType="VarChar(50)")]
		public string v_fec_nac
		{
			get
			{
				return this._v_fec_nac;
			}
			set
			{
				if ((this._v_fec_nac != value))
				{
					this.Onv_fec_nacChanging(value);
					this.SendPropertyChanging();
					this._v_fec_nac = value;
					this.SendPropertyChanged("v_fec_nac");
					this.Onv_fec_nacChanged();
				}
			}
		}
		
		public event PropertyChangingEventHandler PropertyChanging;
		
		public event PropertyChangedEventHandler PropertyChanged;
		
		protected virtual void SendPropertyChanging()
		{
			if ((this.PropertyChanging != null))
			{
				this.PropertyChanging(this, emptyChangingEventArgs);
			}
		}
		
		protected virtual void SendPropertyChanged(String propertyName)
		{
			if ((this.PropertyChanged != null))
			{
				this.PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
			}
		}
	}
}
#pragma warning restore 1591
